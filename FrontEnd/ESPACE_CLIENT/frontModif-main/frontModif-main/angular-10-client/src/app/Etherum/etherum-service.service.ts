import { HttpClient, HttpHeaders } from '@angular/common/http';
import { Injectable } from '@angular/core';



import { BienIm } from '../bienImClass/bien-Im';
@Injectable({
  providedIn: 'root'
})
export class EtherumServiceService {

  constructor(private http:HttpClient) { }
  baseUrl = "http://localhost:9191/apiii/etherum";
  save(addressVendeur :string,addressAcheteur :string, titre :any,price :number,date:string){
    const body =JSON.stringify({addressVendeur:addressVendeur,addressAcheteur:addressAcheteur, titre:titre, price:price,date:date}) ;
    
    const headers=new HttpHeaders();
    return this.http.post(this.baseUrl +"/saveEtherum?addressVendeur="+addressVendeur+"&addressAcheteur="+addressAcheteur,{titre:titre,price:price,date:date},{headers:headers});
  }
 
  /*saveTransaction( bienIm:BienIm){
  
    
    return this.http.post(this.baseUrl +"/transaction",bienIm);
  }*/
  getContract( address:string){
  
    
    return this.http.get(this.baseUrl +"/getBienImobilier?address="+address);
  }
}




