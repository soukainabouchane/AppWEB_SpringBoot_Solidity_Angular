import { Component, OnInit } from '@angular/core';
import { AuthService } from '../_services/auth.service';
import { TokenStorageService } from '../_services/token-storage.service';

@Component({
  selector: 'app-login',
  templateUrl: './login.component.html',
  styleUrls: ['./login.component.css']
})
export class LoginComponent implements OnInit {

  form: any = {};
  isLoggedIn = false;
  isLoginFailed = false;
  errorMessage = '';
  roles: string[] = [];
  id:any ;
  constructor(private authService: AuthService, private tokenStorage: TokenStorageService) { }

  ngOnInit(): void {
    if (this.tokenStorage.getToken()) {
      this.isLoggedIn = true;
      this.roles = this.tokenStorage.getUser().roles;
      this.id = this.tokenStorage.getUser().id;
      console.log(this.id);
    }
   
  }

  onSubmit(): void {
    this.authService.login(this.form).subscribe(
      data => {
        this.tokenStorage.saveToken(data.accessToken);
        this.tokenStorage.saveUser(data);

        this.isLoginFailed = false;
        this.isLoggedIn = true;
        this.roles = this.tokenStorage.getUser().roles;
        this.reloadPage();
       
        
      },
      err => {
       /* if(err.error.message == null){
          this.errorMessage ="l'utlisateur n'exist pas";
        }else{
        this.errorMessage = err.error.message;
        }*/
        //this.errorMessage = err.error.message;
        this.errorMessage ="l'utlisateur n'exist pas";
      //  console.log(this.errorMessage);
        this.isLoginFailed = true;
      
      }
    );
  }

  reloadPage(): void {
    window.location.reload();
  }

}
