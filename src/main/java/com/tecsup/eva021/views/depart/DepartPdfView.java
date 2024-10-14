package com.tecsup.eva021.views.depart;

import java.awt.Color;
import java.util.List;
import java.util.Map;


import com.tecsup.eva021.domain.entities.Depart;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.view.document.AbstractPdfView;

import com.lowagie.text.Document;
import com.lowagie.text.Phrase;
import com.lowagie.text.pdf.PdfPCell;
import com.lowagie.text.pdf.PdfPTable;
import com.lowagie.text.pdf.PdfWriter;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@Component("/depart/ver")

public class DepartPdfView extends AbstractPdfView {
    @Override
    protected void buildPdfDocument(Map<String, Object> model, Document document, PdfWriter writer,
                                    HttpServletRequest request, HttpServletResponse response) throws Exception {

        List<Depart> departs = (List<Depart>) model.get("departs");

        PdfPTable tabla = new PdfPTable(1);
        tabla.setSpacingAfter(20);

        PdfPCell cell = new PdfPCell(new Phrase("Lista de Departamentos"));
        cell.setBackgroundColor(new Color(184, 218, 255));
        cell.setPadding(8f);
        tabla.addCell(cell);

        PdfPTable tabla2 = new PdfPTable(4);  // Cambia el número de columnas según la estructura de Career
        tabla2.addCell("ID");
        tabla2.addCell("Departamento");
        tabla2.addCell("Ciclo");
        tabla2.addCell("Seccion");

        for(Depart depart : departs) {
            tabla2.addCell(String.valueOf(depart.getId()));
            tabla2.addCell(depart.getName());
            tabla2.addCell(String.valueOf(depart.getCycle()));
            tabla2.addCell(depart.getSection());
        }

        document.add(tabla);
        document.add(tabla2);
    }
}