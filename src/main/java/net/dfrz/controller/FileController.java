package net.dfrz.controller;

import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.image.BufferedImage;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Date;

import javax.imageio.ImageIO;
import javax.servlet.http.HttpServletResponse;

import org.apache.poi.util.IOUtils;
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
			// ��� ԭ�ļ��� ���ļ��� ����·�� �ļ���СKB MD5(32λ�ִ�) �ϴ��� �ϴ�����
			// 1 a.txt 123235346.txt d:/2018/11/03/ 123 asfw123213s123
			IOUtils.copy(upFile.getInputStream(), fos);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return "";
	}

	// ͨ�����ط�ʽ(recommend)
	@RequestMapping("/down")
	public String down(HttpServletResponse response) throws IOException {
		String fileName = "����ƻ���¼.doc";
		//���߿ͻ����������صģ��ᵯ�����ضԻ���
		response.setContentType("application/x-msdownload;");
		//attachment ����  
		//new String(fileName.getBytes("utf-8"), "ISO8859-1") ��ֹ�ļ�������Ϊ���ĵ���������
		response.setHeader("Content-disposition",
				"attachment; filename=" + new String(fileName.getBytes("utf-8"), "ISO8859-1"));
		IOUtils.copy(new FileInputStream("C:\\Users\\YT\\Desktop\\����ƻ���¼.doc"), response.getOutputStream());

		return null;
	}

	// springmvc ���еķ�ʽ
//	@RequestMapping("/down")
//	public ResponseEntity<byte[]> down() throws IOException {
//		String fileName = "����ƻ���¼";
//		HttpHeaders headers = new HttpHeaders();
//		File file = new File("C:\\Users\\YT\\Desktop\\����ƻ���¼.doc");
//		headers.setContentType(MediaType.APPLICATION_OCTET_STREAM);
//		headers.setContentDispositionFormData("attachment", fileName);
//		return new ResponseEntity<byte[]>(FileUtils.readFileToByteArray(file), headers, HttpStatus.CREATED);
//	}
	
	//��֤��
	@RequestMapping("/checkcode")
	public String checkCode(HttpServletResponse response) throws IOException {
		
		//����ͼƬ
		BufferedImage b1=new BufferedImage(100, 50, BufferedImage.TYPE_3BYTE_BGR);
		Graphics g = b1.getGraphics();
		
		Graphics2D g2d = (Graphics2D)g; 
		
		g2d.drawString("hello or lo", 10, 45);
		
		ImageIO.write(b1, "JPEG", response.getOutputStream());
		
		return null;
	}
}
