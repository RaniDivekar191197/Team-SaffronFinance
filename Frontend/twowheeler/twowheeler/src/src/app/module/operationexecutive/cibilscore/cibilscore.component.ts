import { Location } from '@angular/common';
import { Component, OnInit } from '@angular/core';
import { Cibil } from 'app/model/cibil';

import { CommonService } from 'app/shared/common.service';

@Component({
  selector: 'app-cibilscore',
  templateUrl: './cibilscore.component.html',
  styleUrls: ['./cibilscore.component.css']
})
export class CibilscoreComponent implements OnInit {

  ci:Cibil[];
  constructor(private cs:CommonService,private location:Location) { }

  ngOnInit(): void {

    this.cs.getcibilforoe().subscribe((data:Cibil[])=>{

      this.ci=data;
      console.log(this.ci);
    })
  }

}
