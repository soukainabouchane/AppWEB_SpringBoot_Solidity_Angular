import { HttpClient, HttpHeaders } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { BienIm } from '../bienImClass/bien-Im';

const httpOptions = {
  headers: new HttpHeaders({ 'Content-Type': 'application/json' })
};
@Injectable({
  providedIn: 'root'
})

export class BddServiceService {
  constructor(private http:HttpClient) { }

  baseUrl = "http://localhost:9191/apiii/BienIm/";
  savebd(bienIm:BienIm,nomAcheteur:string, nomVendeur:string,addressAcheteur:string, addressVendeur:string, email:string):Observable<any>{

   /* const body =JSON.stringify({address:address,
      titre:titre,
      price:price,
      emailVendeur: emailVendeur,
      nomVendeur: nomVendeur,
      description :description,
      local : local}) ;*/
    
    
    return this.http.post(this.baseUrl +"addBienIm?nomAcheteur="+nomAcheteur+"&nomVendeur="+nomVendeur+"&addressAcheteur="
    +addressAcheteur+"&addressVendeur="+addressVendeur +"&email="+email,bienIm);
  }

  getListBienIm(){
    return this.http.get(this.baseUrl+"findAllBienIm");
  }


  

  SupprimerBienIm(titre:string){
    return this.http.get( this.baseUrl +titre);
   
  }
 getBienIm(titre:string){
    return this.http.get( this.baseUrl+"getBienImm/" +titre);
  }
  
}
