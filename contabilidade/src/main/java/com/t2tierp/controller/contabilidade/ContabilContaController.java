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
package com.t2tierp.controller.contabilidade;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

import com.t2tierp.controller.AbstractController;
import com.t2tierp.model.bean.contabilidade.ContabilConta;
import com.t2tierp.model.bean.contabilidade.PlanoConta;
import com.t2tierp.model.bean.contabilidade.PlanoContaRefSped;
import com.t2tierp.model.dao.InterfaceDAO;

@ManagedBean
@ViewScoped
public class ContabilContaController extends AbstractController<ContabilConta> implements Serializable {

    private static final long serialVersionUID = 1L;
    @EJB
    private InterfaceDAO<PlanoConta> planoContaDao;
    @EJB
    private InterfaceDAO<ContabilConta> contabilContaDao;
    @EJB
    private InterfaceDAO<PlanoContaRefSped> planoContaRefSpedDao;

    @Override
    public Class<ContabilConta> getClazz() {
        return ContabilConta.class;
    }

    @Override
    public String getFuncaoBase() {
        return "CONTABIL_CONTA";
    }

    public List<PlanoConta> getListaPlanoConta(String nome) {
        List<PlanoConta> listaPlanoConta = new ArrayList<>();
        try {
            listaPlanoConta = planoContaDao.getBeansLike(PlanoConta.class, "nome", nome);
        } catch (Exception e) {
            // e.printStackTrace();
        }
        return listaPlanoConta;
    }

    public List<ContabilConta> getListaContabilConta(String nome) {
        List<ContabilConta> listaContabilConta = new ArrayList<>();
        try {
            listaContabilConta = contabilContaDao.getBeansLike(ContabilConta.class, "descricao", nome);
        } catch (Exception e) {
            // e.printStackTrace();
        }
        return listaContabilConta;
    }

    public List<PlanoContaRefSped> getListaPlanoContaRefSped(String nome) {
        List<PlanoContaRefSped> listaPlanoContaRefSped = new ArrayList<>();
        try {
            listaPlanoContaRefSped = planoContaRefSpedDao.getBeansLike(PlanoContaRefSped.class, "descricao", nome);
        } catch (Exception e) {
            // e.printStackTrace();
        }
        return listaPlanoContaRefSped;
    }

}
