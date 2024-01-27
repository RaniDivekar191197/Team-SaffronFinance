import { Component, OnInit } from '@angular/core';
import { FormBuilder, FormGroup } from '@angular/forms';
import { Companyenquirydetails } from 'app/model/companyenquirydetails';
import { CommonService } from 'app/shared/common.service';

@Component({
  selector: 'app-enquiry',
  templateUrl: './enquiry.component.html',
  styleUrls: ['./enquiry.component.css']
})
export class EnquiryComponent implements OnInit {
  
  enquiryForm:FormGroup

  constructor(private fb:FormBuilder, private cs:CommonService) { }

  ngOnInit(): void {
    this.enquiryForm=this.fb.group({
      enqId:[],
      companyname:[''],
      companypan:[''],
      companyemailid:[''],
      companycontactnumber:[''],
      cityname:[''],
      loanamountrequired:['']
    })
  }
  enquirySubmit(ced:Companyenquirydetails){
  
    this.cs.saveEnquiry(ced).subscribe();
    alert("submited");
    
    }
  

}
