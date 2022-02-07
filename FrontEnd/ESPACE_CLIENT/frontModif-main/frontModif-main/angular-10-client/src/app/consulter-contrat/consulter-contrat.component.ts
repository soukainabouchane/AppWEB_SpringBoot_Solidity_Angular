import { Component, OnInit } from '@angular/core';
import { BddServiceService } from '../bddService/bdd-service.service';
import { EtherumServiceService } from '../Etherum/etherum-service.service';

@Component({
  selector: 'app-consulter-contrat',
  templateUrl: './consulter-contrat.component.html',
  styleUrls: ['./consulter-contrat.component.css']
})
export class ConsulterContratComponent implements OnInit {
  titre:any;
  tit:any;
  send=false;
  constructor(private bddService: BddServiceService) { }

  ngOnInit(): void {
  }
update(){
  this.bddService.getBienIm(this.titre).subscribe((response : any) => {
    this.tit = response;
    console.log( this.titre);
    this.send=true;
    
  });
}
}
