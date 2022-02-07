import { Component, OnInit } from '@angular/core';
import { ActivatedRoute } from '@angular/router';
import { BienIm } from '../bienImClass/bien-Im';
import { EtherumServiceService } from '../Etherum/etherum-service.service';
import { TokenStorageService } from '../_services/token-storage.service';
import { UserService } from '../_services/user.service';

@Component({
  selector: 'app-profile',
  templateUrl: './profile.component.html',
  styleUrls: ['./profile.component.css']
})
export class ProfileComponent implements OnInit {

  currentUser: any;
  content: string;
  address:string;
  titre:string;
  price: number;
  bienIm= new BienIm();
  constructor(private token: TokenStorageService,private route: ActivatedRoute,private userService: UserService ,private etherumService: EtherumServiceService) { }

  ngOnInit(): void {
    this.currentUser = this.token.getUser();
  }

 
}
