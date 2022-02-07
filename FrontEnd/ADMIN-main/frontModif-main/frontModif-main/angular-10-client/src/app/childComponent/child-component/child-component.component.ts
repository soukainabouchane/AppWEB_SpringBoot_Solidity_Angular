import { Component, OnInit ,Input} from '@angular/core';
import { BienIm } from 'src/app/bienImClass/bien-Im';
import { EtherumServiceService } from 'src/app/Etherum/etherum-service.service';

@Component({
  selector: 'app-child-component',
  templateUrl: './child-component.component.html',
  styleUrls: ['./child-component.component.css']
})
export class ChildComponentComponent implements OnInit {
   BienIm:BienIm[];
  constructor(private etherumService: EtherumServiceService) { }
@Input() item;

  ngOnInit(): void {
    console.log(this.item);
   
  }

}
