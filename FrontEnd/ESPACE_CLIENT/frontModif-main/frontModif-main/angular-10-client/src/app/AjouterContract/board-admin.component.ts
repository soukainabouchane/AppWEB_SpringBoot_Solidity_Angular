import { Component, OnInit } from '@angular/core';

import { UserService } from '../_services/user.service';
import { EtherumServiceService } from '../Etherum/etherum-service.service';
import { BienIm } from '../bienImClass/bien-Im';
import { ActivatedRoute, Router } from '@angular/router';
import { BddServiceService } from 'src/app/bddService/bdd-service.service';
import { HttpClientModule } from '@angular/common/http';
import { TokenStorageService } from '../_services/token-storage.service';
@Component({
  selector: 'app-board-admin',
  templateUrl: './board-admin.component.html',
  styleUrls: ['./board-admin.component.css']
})
export class BoardAdminComponent implements OnInit {
  content:any;
  address:string;
  titre:string;
  price: number;
  submitFailed:boolean;
  bienIm= new BienIm();
  selectedFile=null;
  currentUser: any;
  private roles: string[];
  constructor(private route: ActivatedRoute ,private userService: UserService,private etherumService: EtherumServiceService,
    private bddService: BddServiceService, private router: Router, private http:  HttpClientModule, private token: TokenStorageService) { }
  
  ngOnInit(): void {
    this.userService.getAdminBoard().subscribe(
      data => {
        this.content = data;
      },
      err => {
        this.content = JSON.parse(err.error).message;
      }
    );
   
    this.currentUser = this.token.getUser();
    console.log("hello username" +this.currentUser.email);
  }

  save(){
   
  
    this.etherumService.save(this.bienIm.addressVendeur,this.bienIm.addressAcheteur,this.bienIm.titre,this.bienIm.price,this.bienIm.date).subscribe((response) =>{
      console.log(response);
      this.submitFailed = false;
      const user = this.token.getUser();
      this.roles = user.roles;
      if(this.roles.includes('ROLE_ADMIN')){
        this.router.navigate(['/listContratAdmin']);
      }else if(this.roles.includes('ROLE_USER')){
        this.router.navigate(['/listContratUser']);
      }
      
      },
      err => {
     console.log( err.error.message +"hello");
       
        this.submitFailed = true;
      });
     this.bddService.savebd(this.bienIm,this.bienIm.nomAcheteur,this.bienIm.nomVendeur,this.bienIm.addressAcheteur,this.bienIm.addressVendeur,this.currentUser.email).subscribe((response) =>{
        console.log(response);
        this.submitFailed = false;
        this.router.navigate(['/annonce']);
        },
        err => {
       console.log(err.error.message +"hello");
         
          this.submitFailed = true;});
          if(this.submitFailed = false){
           
          }
    }
 
}
