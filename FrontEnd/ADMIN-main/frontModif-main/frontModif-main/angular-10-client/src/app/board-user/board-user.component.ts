import { Component, OnInit } from '@angular/core';
import { UserService } from '../_services/user.service';
import { User } from 'src/app/user/user';
import { TokenStorageService } from '../_services/token-storage.service';
import { Router } from '@angular/router';


@Component({
  selector: 'app-board-user',
  templateUrl: './board-user.component.html',
  styleUrls: ['./board-user.component.css']
})
export class BoardUserComponent implements OnInit {

  content: string;
 users :User[];
 userss :User[];
 usersss :User[];
 verif: boolean = true;
 j =0;
  constructor(private router: Router,private userService: UserService,private tokenStorageService: TokenStorageService) { }

  ngOnInit(): void {
  

    this.userService.findAllUsers().subscribe((response : any) => {
      this. users = response;
      console.log( response);
      const user = this.tokenStorageService.getUser();
  
         this.userss  = this.users;
    
     
     for(var i = 0; i < this.users.length; i++){
          if(user.username != this.users[i].username){
                this.userss[this.j] = this.users[i];
                this.j = this.j + 1;
          }
      }
     
    });
   
  }
 
 
   
  supprime(id:string){
   
  
    this.userService.deleteUser(id).subscribe(
      data => {
 
       this.reloadPage();
      },
      err => {
     
       this.reloadPage();
      }
    );
    
  }
  reloadPage(): void {
    window.location.reload();
  }
}