import { Component, OnInit } from '@angular/core';
import { BddServiceService } from '../bddService/bdd-service.service';
import { BienIm } from '../bienImClass/bien-Im';

@Component({
  selector: 'app-list-contart-user',
  templateUrl: './list-contart-user.component.html',
  styleUrls: ['./list-contart-user.component.css']
})
export class ListContartUserComponent implements OnInit {

  listBienIm : BienIm[];
  constructor( private bddService: BddServiceService) { }

  ngOnInit(): void {
    this.bddService.getListBienIm().subscribe((response : any) => {
      this. listBienIm = response;
    });
  }

}

