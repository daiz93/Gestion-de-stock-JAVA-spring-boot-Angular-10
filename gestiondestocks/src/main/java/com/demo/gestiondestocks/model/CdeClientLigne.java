package com.demo.gestiondestocks.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


import javax.persistence.Entity;
import javax.persistence.Table;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name="cdeClientLigne")

public class CdeClientLigne  extends AbstractEntity{
}
