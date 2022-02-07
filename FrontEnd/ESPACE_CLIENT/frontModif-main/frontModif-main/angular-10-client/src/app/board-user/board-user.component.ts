import { Component, OnInit } from '@angular/core';
import { UserService } from '../_services/user.service';
import { User } from 'src/app/user/user';

@Component({
  selector: 'app-board-user',
  templateUrl: './board-user.component.html',
  styleUrls: ['./board-user.component.css']
})
export class BoardUserComponent implements OnInit {

  content: string;
 users :User[];
 
  constructor(private userService: UserService) { }

  ngOnInit(): void {
    this.userService.getUserBoard().subscribe(
      data => {
        this.content = data;
      },
      err => {
        this.content = JSON.parse(err.error).message;
      }
    );

    this.userService.findAllUsers().subscribe((response : any) => {
      this. users = response;
    });
  }
 
   
supprime(id:string){
  console.log(id);
  this.userService.deleteUser(id).subscribe();
  this.userService.findAllUsers().subscribe((response : any) => {
    this. users = response;
  });
}
}