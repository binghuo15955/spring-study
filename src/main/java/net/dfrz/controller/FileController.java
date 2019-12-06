package net.dfrz.controller;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Date;

import javax.servlet.http.HttpServletResponse;

import org.apache.commons.io.FileUtils;
import org.apache.poi.util.IOUtils;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.multipart.MultipartFile;

@Controller
@RequestMapping("file")
public class FileController {

	@RequestMapping("up")
	public String upload(MultipartFile upFile, String desc) {
		try {
			FileOutputStream fos = new FileOutputStream("d:/" + upFile.getOriginalFilename());
			String newFileName = new Date().getTime() + "";
			// 序号 原文件名 新文件名 保存路径 文件大小KB MD5(32位字串) 上传人 上传日期
			// 1 a.txt 123235346.txt d:/2018/11/03/ 123 asfw123213s123
			IOUtils.copy(upFile.getInputStream(), fos);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return "";
	}

	// 通用下载方式(recommend)
	@RequestMapping("/down")
	public String down(HttpServletResponse response) throws IOException {
		String fileName = "健身计划记录.doc";
		//告诉客户端这是下载的，会弹出下载对话框
		response.setContentType("application/x-msdownload;");
		//attachment 附件  
		//new String(fileName.getBytes("utf-8"), "ISO8859-1") 防止文件下载名为中文的乱码问题
		response.setHeader("Content-disposition",
				"attachment; filename=" + new String(fileName.getBytes("utf-8"), "ISO8859-1"));
		IOUtils.copy(new FileInputStream("C:\\Users\\YT\\Desktop\\健身计划记录.doc"), response.getOutputStream());

		return null;
	}

	// springmvc 特有的方式
//	@RequestMapping("/down")
//	public ResponseEntity<byte[]> down() throws IOException {
//		String fileName = "健身计划记录";
//		HttpHeaders headers = new HttpHeaders();
//		File file = new File("C:\\Users\\YT\\Desktop\\健身计划记录.doc");
//		headers.setContentType(MediaType.APPLICATION_OCTET_STREAM);
//		headers.setContentDispositionFormData("attachment", fileName);
//		return new ResponseEntity<byte[]>(FileUtils.readFileToByteArray(file), headers, HttpStatus.CREATED);
//	}
}
