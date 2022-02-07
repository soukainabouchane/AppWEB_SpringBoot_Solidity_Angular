import { Component, OnInit } from '@angular/core';
import { ActivatedRoute, Router } from '@angular/router';
import { BddServiceService } from 'src/app/bddService/bdd-service.service';
import { BienIm } from 'src/app/bienImClass/bien-Im';

@Component({
  selector: 'app-detail',
  templateUrl: './detail.component.html',
  styleUrls: ['./detail.component.css']
})
export class DetailComponent implements OnInit {
  
  titre:string;
  cntr:any;
  constructor(private bddService: BddServiceService,private route: ActivatedRoute) { }

  ngOnInit(): void {
    this.titre = this.route.snapshot.params.titre;
    this.bddService.getBienIm(this.titre).subscribe((response : any) => {
     
      this.cntr =response;
      console.log(response);
    });
  }

}
