import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Companyenquirydetails } from 'app/model/companyenquirydetails';
import { Observable } from 'rxjs';
import { Document } from 'app/model/document';
import { CibilscoreComponent } from 'app/module/operationexecutive/cibilscore/cibilscore.component';
import { Cibil } from 'app/model/cibil';


@Injectable({
  providedIn: 'root'
})
export class CommonService {
  saveenquiryurl:string="http://localhost:9090/regCompanyEnquiryDetails";
  docsaveurl:string="http://localhost:9091/adddoc";
  getEnquiryUrl:string="http://localhost:9093/getCompanyEnquiryDetails"
  //getcibilurl:string="http://localhost:9090/getcibilscore";

 singleenquiry:string="http://localhost:9093/getsingleCustomer";

 url:string="http://localhost:9090/getcibilscore";
 
  constructor(private http:HttpClient) { }

  saveEnquiry(ced:Companyenquirydetails):Observable<Companyenquirydetails>{
    return this.http.post<Companyenquirydetails>(this.saveenquiryurl,ced)
  }

  postDocument(uploadDocument:any):Observable<Document>{
    return this.http.post<Document>(this.docsaveurl,uploadDocument)
  }

  getEnquiryforoe():Observable<Companyenquirydetails[]>{
    return this.http.get<Companyenquirydetails[]>(this.getEnquiryUrl)
  }

  getcibilforoe():Observable<Cibil[]>{
    return this.http.get<Cibil[]>(this.url)
  }
  getsinglecustomer(enqId:number):Observable<Companyenquirydetails>{
    return this.http.get<Companyenquirydetails>(this.singleenquiry + '/' + enqId)
  }
}
