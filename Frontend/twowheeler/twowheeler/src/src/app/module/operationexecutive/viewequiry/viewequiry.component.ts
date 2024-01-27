import { Location } from '@angular/common';
import { Component, OnInit } from '@angular/core';
import { FormBuilder } from '@angular/forms';
import { Companyenquirydetails } from 'app/model/companyenquirydetails';
import { CommonService } from 'app/shared/common.service';

@Component({
  selector: 'app-viewequiry',
  templateUrl: './viewequiry.component.html',
  styleUrls: ['./viewequiry.component.css']
})
export class ViewequiryComponent implements OnInit {
  ced:Companyenquirydetails[];
  constructor(private cs:CommonService,location:Location) { }

  ngOnInit(): void {
   
    
    this.cs.getEnquiryforoe().subscribe((data:Companyenquirydetails[])=>{

      this.ced=data;
      console.log(this.ced)
    })

  }

  

}
