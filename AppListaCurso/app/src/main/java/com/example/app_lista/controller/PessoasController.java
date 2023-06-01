package com.example.app_lista.controller;

import android.util.Log;

import androidx.annotation.NonNull;

import com.example.app_lista.model.Pessoa;

public class PessoasController {
    @NonNull
    @Override
    public String toString() {
        Log.d("MVC_Controller", "Controller iniciado...");
        return super.toString();
    }


    public void salvar(Pessoa outraPessoa) {
        Log.d("MVC_Controller","Salvo"+outraPessoa.toString());
    }
}
