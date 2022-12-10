/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author acer
 */
@Entity
@Table(name = "WEEKCOVID")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Weekcovid.findAll", query = "SELECT w FROM Weekcovid w"),
    @NamedQuery(name = "Weekcovid.findBySeq", query = "SELECT w FROM Weekcovid w WHERE w.seq = :seq"),
    @NamedQuery(name = "Weekcovid.findByCovidyear", query = "SELECT w FROM Weekcovid w WHERE w.covidyear = :covidyear"),
    @NamedQuery(name = "Weekcovid.findByWeeknum", query = "SELECT w FROM Weekcovid w WHERE w.weeknum = :weeknum"),
    @NamedQuery(name = "Weekcovid.findByNewCase", query = "SELECT w FROM Weekcovid w WHERE w.newCase = :newCase"),
    @NamedQuery(name = "Weekcovid.findByTotalCase", query = "SELECT w FROM Weekcovid w WHERE w.totalCase = :totalCase"),
    @NamedQuery(name = "Weekcovid.findByNewCaseExcludeabroad", query = "SELECT w FROM Weekcovid w WHERE w.newCaseExcludeabroad = :newCaseExcludeabroad"),
    @NamedQuery(name = "Weekcovid.findByTotalCaseExcludeabroad", query = "SELECT w FROM Weekcovid w WHERE w.totalCaseExcludeabroad = :totalCaseExcludeabroad"),
    @NamedQuery(name = "Weekcovid.findByNewRecovered", query = "SELECT w FROM Weekcovid w WHERE w.newRecovered = :newRecovered"),
    @NamedQuery(name = "Weekcovid.findByTotalRecovered", query = "SELECT w FROM Weekcovid w WHERE w.totalRecovered = :totalRecovered"),
    @NamedQuery(name = "Weekcovid.findByNewDeath", query = "SELECT w FROM Weekcovid w WHERE w.newDeath = :newDeath"),
    @NamedQuery(name = "Weekcovid.findByTotalDeath", query = "SELECT w FROM Weekcovid w WHERE w.totalDeath = :totalDeath"),
    @NamedQuery(name = "Weekcovid.findByCaseForeign", query = "SELECT w FROM Weekcovid w WHERE w.caseForeign = :caseForeign"),
    @NamedQuery(name = "Weekcovid.findByCasePrison", query = "SELECT w FROM Weekcovid w WHERE w.casePrison = :casePrison"),
    @NamedQuery(name = "Weekcovid.findByCaseWalkin", query = "SELECT w FROM Weekcovid w WHERE w.caseWalkin = :caseWalkin"),
    @NamedQuery(name = "Weekcovid.findByCaseNewPrev", query = "SELECT w FROM Weekcovid w WHERE w.caseNewPrev = :caseNewPrev"),
    @NamedQuery(name = "Weekcovid.findByCaseNewDiff", query = "SELECT w FROM Weekcovid w WHERE w.caseNewDiff = :caseNewDiff"),
    @NamedQuery(name = "Weekcovid.findByDeathNewPrev", query = "SELECT w FROM Weekcovid w WHERE w.deathNewPrev = :deathNewPrev"),
    @NamedQuery(name = "Weekcovid.findByDeathNewDiff", query = "SELECT w FROM Weekcovid w WHERE w.deathNewDiff = :deathNewDiff"),
    @NamedQuery(name = "Weekcovid.findByUpdateDate", query = "SELECT w FROM Weekcovid w WHERE w.updateDate = :updateDate")})
public class Weekcovid implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "SEQ")
    private Integer seq;
    @Column(name = "COVIDYEAR")
    private Integer covidyear;
    @Column(name = "WEEKNUM")
    private Integer weeknum;
    @Column(name = "NEW_CASE")
    private Integer newCase;
    @Column(name = "TOTAL_CASE")
    private Integer totalCase;
    @Column(name = "NEW_CASE_EXCLUDEABROAD")
    private Integer newCaseExcludeabroad;
    @Column(name = "TOTAL_CASE_EXCLUDEABROAD")
    private Integer totalCaseExcludeabroad;
    @Column(name = "NEW_RECOVERED")
    private Integer newRecovered;
    @Column(name = "TOTAL_RECOVERED")
    private Integer totalRecovered;
    @Column(name = "NEW_DEATH")
    private Integer newDeath;
    @Column(name = "TOTAL_DEATH")
    private Integer totalDeath;
    @Column(name = "CASE_FOREIGN")
    private Integer caseForeign;
    @Column(name = "CASE_PRISON")
    private Integer casePrison;
    @Column(name = "CASE_WALKIN")
    private Integer caseWalkin;
    @Column(name = "CASE_NEW_PREV")
    private Integer caseNewPrev;
    @Column(name = "CASE_NEW_DIFF")
    private Integer caseNewDiff;
    @Column(name = "DEATH_NEW_PREV")
    private Integer deathNewPrev;
    @Column(name = "DEATH_NEW_DIFF")
    private Integer deathNewDiff;
    @Column(name = "UPDATE_DATE")
    @Temporal(TemporalType.TIMESTAMP)
    private Date updateDate;

    public Weekcovid() {
    }
    

    public Weekcovid(Integer covidyear, Integer weeknum, Integer newCase, Integer totalCase, Integer newCaseExcludeabroad, Integer totalCaseExcludeabroad, Integer newRecovered, Integer totalRecovered, Integer newDeath, Integer totalDeath, Integer caseForeign, Integer casePrison, Integer caseWalkin, Integer caseNewPrev, Integer caseNewDiff, Integer deathNewPrev, Integer deathNewDiff, Date updateDate) {
        this.covidyear = covidyear;
        this.weeknum = weeknum;
        this.newCase = newCase;
        this.totalCase = totalCase;
        this.newCaseExcludeabroad = newCaseExcludeabroad;
        this.totalCaseExcludeabroad = totalCaseExcludeabroad;
        this.newRecovered = newRecovered;
        this.totalRecovered = totalRecovered;
        this.newDeath = newDeath;
        this.totalDeath = totalDeath;
        this.caseForeign = caseForeign;
        this.casePrison = casePrison;
        this.caseWalkin = caseWalkin;
        this.caseNewPrev = caseNewPrev;
        this.caseNewDiff = caseNewDiff;
        this.deathNewPrev = deathNewPrev;
        this.deathNewDiff = deathNewDiff;
        this.updateDate = updateDate;
    }
    

    public Weekcovid(Integer seq) {
        this.seq = seq;
    }

    public Integer getSeq() {
        return seq;
    }

    public void setSeq(Integer seq) {
        this.seq = seq;
    }

    public Integer getCovidyear() {
        return covidyear;
    }

    public void setCovidyear(Integer covidyear) {
        this.covidyear = covidyear;
    }

    public Integer getWeeknum() {
        return weeknum;
    }

    public void setWeeknum(Integer weeknum) {
        this.weeknum = weeknum;
    }

    public Integer getNewCase() {
        return newCase;
    }

    public void setNewCase(Integer newCase) {
        this.newCase = newCase;
    }

    public Integer getTotalCase() {
        return totalCase;
    }

    public void setTotalCase(Integer totalCase) {
        this.totalCase = totalCase;
    }

    public Integer getNewCaseExcludeabroad() {
        return newCaseExcludeabroad;
    }

    public void setNewCaseExcludeabroad(Integer newCaseExcludeabroad) {
        this.newCaseExcludeabroad = newCaseExcludeabroad;
    }

    public Integer getTotalCaseExcludeabroad() {
        return totalCaseExcludeabroad;
    }

    public void setTotalCaseExcludeabroad(Integer totalCaseExcludeabroad) {
        this.totalCaseExcludeabroad = totalCaseExcludeabroad;
    }

    public Integer getNewRecovered() {
        return newRecovered;
    }

    public void setNewRecovered(Integer newRecovered) {
        this.newRecovered = newRecovered;
    }

    public Integer getTotalRecovered() {
        return totalRecovered;
    }

    public void setTotalRecovered(Integer totalRecovered) {
        this.totalRecovered = totalRecovered;
    }

    public Integer getNewDeath() {
        return newDeath;
    }

    public void setNewDeath(Integer newDeath) {
        this.newDeath = newDeath;
    }

    public Integer getTotalDeath() {
        return totalDeath;
    }

    public void setTotalDeath(Integer totalDeath) {
        this.totalDeath = totalDeath;
    }

    public Integer getCaseForeign() {
        return caseForeign;
    }

    public void setCaseForeign(Integer caseForeign) {
        this.caseForeign = caseForeign;
    }

    public Integer getCasePrison() {
        return casePrison;
    }

    public void setCasePrison(Integer casePrison) {
        this.casePrison = casePrison;
    }

    public Integer getCaseWalkin() {
        return caseWalkin;
    }

    public void setCaseWalkin(Integer caseWalkin) {
        this.caseWalkin = caseWalkin;
    }

    public Integer getCaseNewPrev() {
        return caseNewPrev;
    }

    public void setCaseNewPrev(Integer caseNewPrev) {
        this.caseNewPrev = caseNewPrev;
    }

    public Integer getCaseNewDiff() {
        return caseNewDiff;
    }

    public void setCaseNewDiff(Integer caseNewDiff) {
        this.caseNewDiff = caseNewDiff;
    }

    public Integer getDeathNewPrev() {
        return deathNewPrev;
    }

    public void setDeathNewPrev(Integer deathNewPrev) {
        this.deathNewPrev = deathNewPrev;
    }

    public Integer getDeathNewDiff() {
        return deathNewDiff;
    }

    public void setDeathNewDiff(Integer deathNewDiff) {
        this.deathNewDiff = deathNewDiff;
    }

    public Date getUpdateDate() {
        return updateDate;
    }

    public void setUpdateDate(Date updateDate) {
        this.updateDate = updateDate;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (seq != null ? seq.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Weekcovid)) {
            return false;
        }
        Weekcovid other = (Weekcovid) object;
        if ((this.seq == null && other.seq != null) || (this.seq != null && !this.seq.equals(other.seq))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "model.Weekcovid[ seq=" + seq + " ]";
    }
    
}
