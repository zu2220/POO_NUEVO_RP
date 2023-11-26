
package Interfacez;

import Clases.DocumentoAcreditadorGasto;
import java.util.List;


public interface IDocumentoAcreditadorGasto {
    public List <DocumentoAcreditadorGasto> getAllSolicitudViatico(); //Listado
    public DocumentoAcreditadorGasto getDocumentoAcreditadorGastoByIndex(int index);  //Buscar
    public void addDocumentoAcreditadorGasto(DocumentoAcreditadorGasto obj); //Añadir
    public void updateDocumentoAcrditadorGasto(DocumentoAcreditadorGasto obj); //Actualizar o editar
    public void deleteDocumentoAcreditadorGastoByIndex(int index); //Eliminar
}
