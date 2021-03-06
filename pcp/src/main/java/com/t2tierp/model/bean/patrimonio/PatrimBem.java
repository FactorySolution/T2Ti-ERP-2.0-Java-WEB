/*
* The MIT License
* 
* Copyright: Copyright (C) 2014 T2Ti.COM
* 
* Permission is hereby granted, free of charge, to any person obtaining a copy
* of this software and associated documentation files (the "Software"), to deal
* in the Software without restriction, including without limitation the rights
* to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
* copies of the Software, and to permit persons to whom the Software is
* furnished to do so, subject to the following conditions:
* 
* The above copyright notice and this permission notice shall be included in
* all copies or substantial portions of the Software.
* 
* THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
* IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
* FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
* AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
* LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
* OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN
* THE SOFTWARE.
* 
* The author may be contacted at: t2ti.com@gmail.com
*
* @author Claudio de Barros (T2Ti.com)
* @version 2.0
*/
package com.t2tierp.model.bean.patrimonio;

import com.t2tierp.model.bean.cadastros.Colaborador;
import com.t2tierp.model.bean.cadastros.Fornecedor;
import com.t2tierp.model.bean.cadastros.Setor;
import com.t2tierp.model.bean.contabilidade.CentroResultado;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;


@Entity
@Table(name = "PATRIM_BEM")
public class PatrimBem implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "ID")
    private Integer id;
    @Column(name = "NUMERO_NB")
    private String numeroNb;
    @Column(name = "NOME")
    private String nome;
    @Column(name = "DESCRICAO")
    private String descricao;
    @Column(name = "NUMERO_SERIE")
    private String numeroSerie;
    @Temporal(TemporalType.DATE)
    @Column(name = "DATA_AQUISICAO")
    private Date dataAquisicao;
    @Temporal(TemporalType.DATE)
    @Column(name = "DATA_ACEITE")
    private Date dataAceite;
    @Temporal(TemporalType.DATE)
    @Column(name = "DATA_CADASTRO")
    private Date dataCadastro;
    @Temporal(TemporalType.DATE)
    @Column(name = "DATA_CONTABILIZADO")
    private Date dataContabilizado;
    @Temporal(TemporalType.DATE)
    @Column(name = "DATA_VISTORIA")
    private Date dataVistoria;
    @Temporal(TemporalType.DATE)
    @Column(name = "DATA_MARCACAO")
    private Date dataMarcacao;
    @Temporal(TemporalType.DATE)
    @Column(name = "DATA_BAIXA")
    private Date dataBaixa;
    @Temporal(TemporalType.DATE)
    @Column(name = "VENCIMENTO_GARANTIA")
    private Date vencimentoGarantia;
    @Column(name = "NUMERO_NOTA_FISCAL")
    private String numeroNotaFiscal;
    @Column(name = "CHAVE_NFE")
    private String chaveNfe;
    @Column(name = "VALOR_ORIGINAL")
    private BigDecimal valorOriginal;
    @Column(name = "VALOR_COMPRA")
    private BigDecimal valorCompra;
    @Column(name = "VALOR_ATUALIZADO")
    private BigDecimal valorAtualizado;
    @Column(name = "VALOR_BAIXA")
    private BigDecimal valorBaixa;
    @Column(name = "DEPRECIA")
    private String deprecia;
    @Column(name = "METODO_DEPRECIACAO")
    private String metodoDepreciacao;
    @Temporal(TemporalType.DATE)
    @Column(name = "INICIO_DEPRECIACAO")
    private Date inicioDepreciacao;
    @Temporal(TemporalType.DATE)
    @Column(name = "ULTIMA_DEPRECIACAO")
    private Date ultimaDepreciacao;
    @Column(name = "TIPO_DEPRECIACAO")
    private String tipoDepreciacao;
    @Column(name = "TAXA_ANUAL_DEPRECIACAO")
    private BigDecimal taxaAnualDepreciacao;
    @Column(name = "TAXA_MENSAL_DEPRECIACAO")
    private BigDecimal taxaMensalDepreciacao;
    @Column(name = "TAXA_DEPRECIACAO_ACELERADA")
    private BigDecimal taxaDepreciacaoAcelerada;
    @Column(name = "TAXA_DEPRECIACAO_INCENTIVADA")
    private BigDecimal taxaDepreciacaoIncentivada;
    @Column(name = "FUNCAO")
    private String funcao;
    @JoinColumn(name = "ID_PATRIM_GRUPO_BEM", referencedColumnName = "ID")
    @ManyToOne(optional = false)
    private PatrimGrupoBem patrimGrupoBem;
    @JoinColumn(name = "ID_PATRIM_TIPO_AQUISICAO_BEM", referencedColumnName = "ID")
    @ManyToOne(optional = false)
    private PatrimTipoAquisicaoBem patrimTipoAquisicaoBem;
    @JoinColumn(name = "ID_PATRIM_ESTADO_CONSERVACAO", referencedColumnName = "ID")
    @ManyToOne(optional = false)
    private PatrimEstadoConservacao patrimEstadoConservacao;
    @JoinColumn(name = "ID_COLABORADOR", referencedColumnName = "ID")
    @ManyToOne(optional = false)
    private Colaborador colaborador;
    @JoinColumn(name = "ID_FORNECEDOR", referencedColumnName = "ID")
    @ManyToOne(optional = false)
    private Fornecedor fornecedor;
    @JoinColumn(name = "ID_SETOR", referencedColumnName = "ID")
    @ManyToOne(optional = false)
    private Setor setor;
    @JoinColumn(name = "ID_CENTRO_RESULTADO", referencedColumnName = "ID")
    @ManyToOne(optional = false)
    private CentroResultado centroResultado;

    public PatrimBem() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNumeroNb() {
        return numeroNb;
    }

    public void setNumeroNb(String numeroNb) {
        this.numeroNb = numeroNb;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getNumeroSerie() {
        return numeroSerie;
    }

    public void setNumeroSerie(String numeroSerie) {
        this.numeroSerie = numeroSerie;
    }

    public Date getDataAquisicao() {
        return dataAquisicao;
    }

    public void setDataAquisicao(Date dataAquisicao) {
        this.dataAquisicao = dataAquisicao;
    }

    public Date getDataAceite() {
        return dataAceite;
    }

    public void setDataAceite(Date dataAceite) {
        this.dataAceite = dataAceite;
    }

    public Date getDataCadastro() {
        return dataCadastro;
    }

    public void setDataCadastro(Date dataCadastro) {
        this.dataCadastro = dataCadastro;
    }

    public Date getDataContabilizado() {
        return dataContabilizado;
    }

    public void setDataContabilizado(Date dataContabilizado) {
        this.dataContabilizado = dataContabilizado;
    }

    public Date getDataVistoria() {
        return dataVistoria;
    }

    public void setDataVistoria(Date dataVistoria) {
        this.dataVistoria = dataVistoria;
    }

    public Date getDataMarcacao() {
        return dataMarcacao;
    }

    public void setDataMarcacao(Date dataMarcacao) {
        this.dataMarcacao = dataMarcacao;
    }

    public Date getDataBaixa() {
        return dataBaixa;
    }

    public void setDataBaixa(Date dataBaixa) {
        this.dataBaixa = dataBaixa;
    }

    public Date getVencimentoGarantia() {
        return vencimentoGarantia;
    }

    public void setVencimentoGarantia(Date vencimentoGarantia) {
        this.vencimentoGarantia = vencimentoGarantia;
    }

    public String getNumeroNotaFiscal() {
        return numeroNotaFiscal;
    }

    public void setNumeroNotaFiscal(String numeroNotaFiscal) {
        this.numeroNotaFiscal = numeroNotaFiscal;
    }

    public String getChaveNfe() {
        return chaveNfe;
    }

    public void setChaveNfe(String chaveNfe) {
        this.chaveNfe = chaveNfe;
    }

    public BigDecimal getValorOriginal() {
        return valorOriginal;
    }

    public void setValorOriginal(BigDecimal valorOriginal) {
        this.valorOriginal = valorOriginal;
    }

    public BigDecimal getValorCompra() {
        return valorCompra;
    }

    public void setValorCompra(BigDecimal valorCompra) {
        this.valorCompra = valorCompra;
    }

    public BigDecimal getValorAtualizado() {
        return valorAtualizado;
    }

    public void setValorAtualizado(BigDecimal valorAtualizado) {
        this.valorAtualizado = valorAtualizado;
    }

    public BigDecimal getValorBaixa() {
        return valorBaixa;
    }

    public void setValorBaixa(BigDecimal valorBaixa) {
        this.valorBaixa = valorBaixa;
    }

    public String getDeprecia() {
        return deprecia;
    }

    public void setDeprecia(String deprecia) {
        this.deprecia = deprecia;
    }

    public String getMetodoDepreciacao() {
        return metodoDepreciacao;
    }

    public void setMetodoDepreciacao(String metodoDepreciacao) {
        this.metodoDepreciacao = metodoDepreciacao;
    }

    public Date getInicioDepreciacao() {
        return inicioDepreciacao;
    }

    public void setInicioDepreciacao(Date inicioDepreciacao) {
        this.inicioDepreciacao = inicioDepreciacao;
    }

    public Date getUltimaDepreciacao() {
        return ultimaDepreciacao;
    }

    public void setUltimaDepreciacao(Date ultimaDepreciacao) {
        this.ultimaDepreciacao = ultimaDepreciacao;
    }

    public String getTipoDepreciacao() {
        return tipoDepreciacao;
    }

    public void setTipoDepreciacao(String tipoDepreciacao) {
        this.tipoDepreciacao = tipoDepreciacao;
    }

    public BigDecimal getTaxaAnualDepreciacao() {
        return taxaAnualDepreciacao;
    }

    public void setTaxaAnualDepreciacao(BigDecimal taxaAnualDepreciacao) {
        this.taxaAnualDepreciacao = taxaAnualDepreciacao;
    }

    public BigDecimal getTaxaMensalDepreciacao() {
        return taxaMensalDepreciacao;
    }

    public void setTaxaMensalDepreciacao(BigDecimal taxaMensalDepreciacao) {
        this.taxaMensalDepreciacao = taxaMensalDepreciacao;
    }

    public BigDecimal getTaxaDepreciacaoAcelerada() {
        return taxaDepreciacaoAcelerada;
    }

    public void setTaxaDepreciacaoAcelerada(BigDecimal taxaDepreciacaoAcelerada) {
        this.taxaDepreciacaoAcelerada = taxaDepreciacaoAcelerada;
    }

    public BigDecimal getTaxaDepreciacaoIncentivada() {
        return taxaDepreciacaoIncentivada;
    }

    public void setTaxaDepreciacaoIncentivada(BigDecimal taxaDepreciacaoIncentivada) {
        this.taxaDepreciacaoIncentivada = taxaDepreciacaoIncentivada;
    }

    public String getFuncao() {
        return funcao;
    }

    public void setFuncao(String funcao) {
        this.funcao = funcao;
    }

    public PatrimGrupoBem getPatrimGrupoBem() {
        return patrimGrupoBem;
    }

    public void setPatrimGrupoBem(PatrimGrupoBem patrimGrupoBem) {
        this.patrimGrupoBem = patrimGrupoBem;
    }

    public PatrimTipoAquisicaoBem getPatrimTipoAquisicaoBem() {
        return patrimTipoAquisicaoBem;
    }

    public void setPatrimTipoAquisicaoBem(PatrimTipoAquisicaoBem patrimTipoAquisicaoBem) {
        this.patrimTipoAquisicaoBem = patrimTipoAquisicaoBem;
    }

    public PatrimEstadoConservacao getPatrimEstadoConservacao() {
        return patrimEstadoConservacao;
    }

    public void setPatrimEstadoConservacao(PatrimEstadoConservacao patrimEstadoConservacao) {
        this.patrimEstadoConservacao = patrimEstadoConservacao;
    }

    public Colaborador getColaborador() {
        return colaborador;
    }

    public void setColaborador(Colaborador colaborador) {
        this.colaborador = colaborador;
    }

    public Fornecedor getFornecedor() {
        return fornecedor;
    }

    public void setFornecedor(Fornecedor fornecedor) {
        this.fornecedor = fornecedor;
    }

    public Setor getSetor() {
        return setor;
    }

    public void setSetor(Setor setor) {
        this.setor = setor;
    }

    public CentroResultado getCentroResultado() {
        return centroResultado;
    }

    public void setCentroResultado(CentroResultado centroResultado) {
        this.centroResultado = centroResultado;
    }

    @Override
    public String toString() {
        return "com.t2tierp.model.bean.patrimonio.PatrimBem[id=" + id + "]";
    }

}
