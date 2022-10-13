package com.storeunisoftware.storeunisoftware.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.Data;

@Data // Lombok annotation to auto generate getters and setters
@Entity
@Table(name = "venta")
public class Venta {

    @Id
    @GeneratedValue
    private Integer id;

    @Column
    private Date fechaNacimiento;

    @Column
    private Double total;

    @ManyToOne //! Relacion muchos a uno
    @JoinColumn(name = "id_cliente") //! campo foraneo
    private Cliente cliente;  //! se declara un objeto de tipo Cliente


}
