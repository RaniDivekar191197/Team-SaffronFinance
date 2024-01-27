import { Component, OnInit } from '@angular/core';
import { FormBuilder, FormGroup } from '@angular/forms';
import { ActivatedRoute } from '@angular/router';
import { CommonService } from 'app/shared/common.service';

@Component({
  selector: 'app-documentupload',
  templateUrl: './documentupload.component.html',
  styleUrls: ['./documentupload.component.css']
})
export class DocumentuploadComponent implements OnInit {

  documentUpload!: FormGroup;
  constructor(private fb: FormBuilder, private cs: CommonService, private root: ActivatedRoute) { }
  doc = new Document();
  documentId: [];
  companyEnqId: [];
  panCard:any;
  rentAggrement: any;
  companyPhotos: any;
  bankStatement: any;
  cancelCheckPhoto: any;
  incomeTaxReturns: any;
  signaturePhoto: any;
  quotationPhoto: any
  ngOnInit(): void {
    this.documentUpload = this.fb.group({
      companyEnqId:[]
    
    })


  }
  onselectedFile1(event:any)
  {
    alert("hello")
    this.panCard=event.target.files[0];
  alert(this.panCard);
  // const file = event.target.files[0];
  // this.reader.onload = e => this.imageSrc1 = this.reader.result;
  // this.reader.readAsDataURL(file);
  }
  onselectedFile2(event:any){this.rentAggrement=event.target.files[0];}
  onselectedFile3(event:any){this.companyPhotos=event.target.files[0];}
  onselectedFile4(event:any){this.bankStatement=event.target.files[0];}
  onselectedFile5(event:any){this.cancelCheckPhoto=event.target.files[0];}
  onselectedFile6(event:any){this.incomeTaxReturns=event.target.files[0];}
  onselectedFile7(event:any){this.signaturePhoto=event.target.files[0];}
  onselectedFile8(event:any){this.quotationPhoto=event.target.files[0];}
  
  save()
  {
    alert("welcome")
    const document1=JSON.stringify(this.documentUpload.value);
  // create object formdata
    const uploadDocument= new FormData();
  // store file formdata
    uploadDocument.append("rentAggrement",this.rentAggrement);
    uploadDocument.append("companyPhotos",this.companyPhotos);
    uploadDocument.append("bankStatement",this.bankStatement);
    uploadDocument.append("cancelCheckPhoto",this.cancelCheckPhoto);
    uploadDocument.append("incomeTaxReturns",this.incomeTaxReturns);
    uploadDocument.append("signaturePhoto",this.signaturePhoto);
    uploadDocument.append("quotationPhoto",this.quotationPhoto);
    uploadDocument.append("doc",document1);
  
  
    this.cs.postDocument(uploadDocument).subscribe();
    console.log("Upload Method")
  
  
     window.location.reload();
  
  }
  image(){

  }

}
