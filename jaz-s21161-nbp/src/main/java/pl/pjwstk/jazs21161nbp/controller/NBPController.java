package pl.pjwstk.jazs21161nbp.controller;

import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import pl.pjwstk.jazs21161nbp.Service.NBPService;
import pl.pjwstk.jazs21161nbp.model.NBPModel;

import java.util.Date;

@RestController
@RequestMapping("/check")
public class NBPController {

    private final NBPService nbpService;

    public NBPController(NBPService nbpService) { this.nbpService = nbpService; }

    @ApiOperation(value =  "Find by ID",
            response = NBPModel.class,
            notes = "Get value from your id")

    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "Ok"),
            @ApiResponse(code = 404, message = "Not found"),
            @ApiResponse(code = 500, message = "Not good"),

    })

    @GetMapping("/{data_od}/{data_do}/avg")
    public ResponseEntity<NBPModel> avgKurs(
            @ApiParam(name = "data_od",
                    type = "date",
                    value = "2021-06-09",
                    example = "2021-06-19",
                    required = true,
                    defaultValue = "1")
            @PathVariable Date data_od,
            @ApiParam(name = "data_do",
                    type = "date",
                    value = "2021-07-04",
                    example = "2021-07-04",
                    required = true,
                    defaultValue = "1")
            @PathVariable Date data_do

    )
    {
        return ResponseEntity.ok(nbpService.avgKurs(data_od,data_do));}
}

