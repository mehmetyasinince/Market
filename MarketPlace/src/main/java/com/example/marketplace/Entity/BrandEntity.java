package com.example.marketplace.Entity;

import lombok.Getter;

import lombok.NoArgsConstructor;
import lombok.Setter;


import javax.persistence.*;


@Entity
@Getter
@Setter
@NoArgsConstructor
@Table(name = "brand")
public class BrandEntity extends BaseEntity {



}
