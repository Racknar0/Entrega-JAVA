package com.storeunisoftware.storeunisoftware.model;

import java.sql.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name = "clientes")
public class Cliente {
    

    @Id
    @GeneratedValue
    private Integer id;

    @Column
    private String nombre;

    @Column
    private String apellido;

    @Column
    private Integer dni;

    @Column
    private Date fechaNacimiento;

    @OneToMany(mappedBy = "cliente") //! Relacion uno a muchos
    private List<Venta> ventasList; //! se declara una lista de ventas
}
