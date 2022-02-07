import { Component, OnInit } from '@angular/core';
import { ActivatedRoute, Router } from '@angular/router';
import { User } from '../user/user';
import { UserService } from '../_services/user.service';

@Component({
  selector: 'app-update-user',
  templateUrl: './update-user.component.html',
  styleUrls: ['./update-user.component.css']
})
export class UpdateUserComponent implements OnInit {
  id:String;
  user:User;
  constructor( private router: Router,private route: ActivatedRoute,private userService: UserService) { }

  ngOnInit(): void {
    this.id = this.route.snapshot.params.id;
    console.log(this.id);

    this.userService. findUser(this.id).subscribe((response:any)=>{
      this.user = response;
      console.log(this.user);
})
  }
  updateUser(){
    
      console.log(this.id);
      this.userService.updateUser(this.id,this.user).subscribe((response)=>{
               
                console.log(response);
                this.router.navigate(['/login']);
      })
    
  }
}
