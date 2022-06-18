package pl.pjwstk.jazs21161nbp.model;

import io.swagger.annotations.ApiModelProperty;

import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.sql.Timestamp;
import java.util.Date;

@Entity
@Table(name="nbpmodel")
public class NBPModel {
    @Id
    @ApiModelProperty(notes = "Id: ", required = true, value = "id", example = "2")
    private Long id;
    @ApiModelProperty(notes = "Waluta: ", required = true, value = "waluta", example = "ZLOTO")
    private Waluta waluta;
    @ApiModelProperty(notes = "Kurs: ", required = true, value = "double", example = "6.99")
    private double kurs;
    @ApiModelProperty(notes = "Data od: ", required = true, value = "date", example = "2022-06-09")
    private Date data_od;
    @ApiModelProperty(notes = "Data do: ", required = true, value = "date", example = "2022-07-04")
    private Date data_do;
    @ApiModelProperty(notes = "Przebieg czasu(Timestamp): ", required = true, value = "timestamp", example = "2022-01-01 00:00:00")
    private Timestamp timestamp;

    public NBPModel(Long id, Waluta waluta, double kurs, Date data_od, Date data_do, Timestamp timestamp) {
        this.id = id;
        this.waluta = waluta;
        this.kurs = kurs;
        this.data_od = data_od;
        this.data_do = data_do;
        this.timestamp = timestamp;
    }

    public NBPModel() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Waluta getWaluta() {
        return waluta;
    }

    public void setWaluta(Waluta waluta) {
        this.waluta = waluta;
    }

    public double getKurs() {
        return kurs;
    }

    public void setKurs(double kurs) {
        this.kurs = kurs;
    }

    public Date getData_od() {
        return data_od;
    }

    public void setData_od(Date data_od) {
        this.data_od = data_od;
    }

    public Date getData_do() {
        return data_do;
    }

    public void setData_do(Date data_do) {
        this.data_do = data_do;
    }


    public Timestamp getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(Timestamp timestamp) {
        this.timestamp = timestamp;
    }
}

