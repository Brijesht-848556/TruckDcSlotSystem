package com.PODownload.Producer.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.*;


@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString

@Entity
@Table(name = "PO")
public class POModel {

   @Id
   @GeneratedValue(strategy = GenerationType.IDENTITY)

   int poNumber;
   @Column(name="poDate")
   String poDate;
   @Column(name="poAddress")
   String poAddress;
   @Column(name="poLineNumber")
   int poLineNumber;
   @Column(name="upcNumber")
   int upcNumber;
   @Column(name="upcName")
   String upcName;
   @Column(name="orderedQuantity")
   int orderedQuantity;

}

