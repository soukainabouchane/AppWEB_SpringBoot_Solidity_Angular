import { Component, NgModule, OnInit } from '@angular/core';
import { ActivatedRoute, Router } from '@angular/router';
import { BddServiceService } from '../bddService/bdd-service.service';
import { BienIm } from '../bienImClass/bien-Im';

@Component({
  selector: 'app-list-contart-admin',
  templateUrl: './list-contart-admin.component.html',
  styleUrls: ['./list-contart-admin.component.css']
})


export class ListContartAdminComponent implements OnInit {
  listBienIm : BienIm[];
  constructor(private route: ActivatedRoute ,private router: Router,
    private bddService: BddServiceService) { }

  ngOnInit(): void {
   this.bddService.getListBienIm().subscribe((response : any) => {
      this. listBienIm = response;
      console.log(response);
    });
    
  }
  Supprimer(titre:string){
    this.bddService.SupprimerBienIm(titre).subscribe((response : any) => {
      console.log(response);
    });
    this.bddService.getListBienIm().subscribe((response : any) => {
      this. listBienIm = response;
    });
  }
}
/*import { Component, OnInit } from '@angular/core';
import { ActivatedRoute, Router } from '@angular/router';
import { BddServiceService } from '../bddService/bdd-service.service';
import { BienIm } from '../bienImClass/bien-Im';

@Component({
  selector: 'app-list-contart-admin',
  templateUrl: './list-contart-admin.component.html',
  styleUrls: ['./list-contart-admin.component.css']
})
export class ListContartAdminComponent implements OnInit {

  listBienIm : BienIm[];
  constructor(private route: ActivatedRoute ,private router: Router,
    private bddService: BddServiceService) { }

  ngOnInit(): void {
    this.bddService.getListBienIm().subscribe((response : any) => {
      this. listBienIm = response;
    });
    
  }
  Supprimer(titre:string){
  this.bddService.SupprimerBienIm(titre).subscribe((response : any) => {
    console.log(response);
  });
  this.bddService.getListBienIm().subscribe((response : any) => {
    this. listBienIm = response;
  });
}

}*/