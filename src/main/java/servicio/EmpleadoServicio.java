package servicio;

import com.api_gitflow.api_gitflow.dao.Empleado;
import com.api_gitflow.api_gitflow.data.MyData;
import com.api_gitflow.api_gitflow.server.ServerApi;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import java.util.List;

@Repository
public class EmpleadoServicio implements ServerApi {

    private final MyData myData;

    @Autowired
    public EmpleadoServicio(MyData myData) {
        this.myData = myData;
    }

    @Override
    public List<Empleado> obtenerTodo() {
        return this.myData.getData();
    }
}
