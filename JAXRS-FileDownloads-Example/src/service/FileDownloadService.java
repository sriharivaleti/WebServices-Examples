package service;
import java.io.File;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.ResponseBuilder;

@Path("/download")
public class FileDownloadService {
	private static final String TEXT_FILE_PATH = "C:\\Users\\kaveti_s\\textfile.txt";
	private static final String IMG_FILE_PATH = "C:\\Users\\kaveti_s\\img.jpg";
	private static final String PDF_FILE_PATH = "C:\\Users\\kaveti_s\\pdffile.pdf";
	private static final String XLS_FILE_PATH = "C:\\Users\\kaveti_s\\excel.xlsx";

	
	//TEXTFILE DOWNLOAD
	@GET
	@Path("/textfile")
	@Produces("text/plain")
	public Response downloadTextFile() {
		File file = new File(TEXT_FILE_PATH);
		ResponseBuilder response = Response.ok((Object) file);
		response.header("Content-Disposition",
			"attachment; filename=\"smlcodes.log\"");
		return response.build();

	}
	
	//IMAGE DOWNLOAD
	@GET
	@Path("/image")
	@Produces("image/jpg")
	public Response downloadImage() {
		File file = new File(IMG_FILE_PATH);
		ResponseBuilder response = Response.ok((Object) file);
		response.header("Content-Disposition",
			"attachment; filename=smlcodes.jpg");
		return response.build();

	}

	//PDF DOWNLOAD
	@GET
	@Path("/pdf")
	@Produces("application/pdf")
	public Response downloadPDF() {
		File file = new File(PDF_FILE_PATH);
		ResponseBuilder response = Response.ok((Object) file);
		response.header("Content-Disposition",
				"attachment; filename=smlcodes.pdf");
		return response.build();
	}

	
	//XLS DOWNLOAD
	@GET
	@Path("/xls")
	@Produces("application/vnd.ms-excel")
	public Response downloadXLS() {
		File file = new File(XLS_FILE_PATH);
		ResponseBuilder response = Response.ok((Object) file);
		response.header("Content-Disposition",
			"attachment; filename=new-smlcodes.xls");
		return response.build();

	}
}
