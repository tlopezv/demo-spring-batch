package com.example.demospringbatch.processor;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.batch.item.ItemProcessor;
import org.springframework.lang.NonNull;
import org.springframework.lang.Nullable;

import com.example.demospringbatch.model.Persona;

public class PersonaItemProcessor implements ItemProcessor<Persona, Persona> {

    private static final Logger LOG = LoggerFactory.getLogger(PersonaItemProcessor.class);

    @Override
    @Nullable
    public Persona process(@NonNull Persona arg0) throws Exception {
        String primerNombre = arg0.getPrimerNombre().toUpperCase();
        String segundoNombre = arg0.getSegundoNombre().toUpperCase();
        String telefono = arg0.getTelefono().toUpperCase();

        Persona persona = new Persona(primerNombre, segundoNombre, telefono);

        LOG.info("Convirtiendo (" + arg0 + ") a (" + persona + ")");

        return persona;
    }

}
