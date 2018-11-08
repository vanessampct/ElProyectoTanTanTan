
package DAO;

import java.util.List;
import DTO.DTOProveedor;

public interface I_operaciones {
    
    public boolean insert (DTOProveedor dtoProveedor);
    public boolean delete (int id);
    public boolean update (DTOProveedor dtoProveedor);
    public List<?> find();
    
}
