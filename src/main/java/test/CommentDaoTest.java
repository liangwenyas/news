package test;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.Test;
import bean.Comment;
import bean.CommentUserView;
import tools.PageInformation;
import dao.DatabaseDao;
import dao.CommentDao;


public class CommentDaoTest {

	@Test
	public void testGetOnePage() throws Exception{
		CommentDao commentDao = new CommentDao();
		PageInformation page = new PageInformation();
		page.setPage(1);
		page.setPageSize(2);
		page.setTotalPageCount(12);
		
		DatabaseDao databaseDao = new DatabaseDao();
		
		//Comment comment = new Comment();
		List<CommentUserView> commentList = commentDao.getOnePage(page, databaseDao);
		assertEquals(new Integer(commentList.size()),page.getPageSize());
	}
	
	@Test
	public void testPaise() throws Exception {
		CommentDao commentDao = new CommentDao();
		Integer sql;
		Integer commentId = 2;
		sql = commentDao.paise(commentId);
		//boolean s = (boolean)sql;
		//assertTrue(false,true);
		
	}

	@Test
	public void testGetStairByNewsId() {
		Comment comment = new Comment();
		
	}
	
	@Test
	public void testAddComment() throws Exception{
		CommentDao commentDao = new CommentDao();
		Comment comment = new Comment();
		
		DatabaseDao databaseDao =new DatabaseDao();
		Integer i;
		i=commentDao.addComment(comment, databaseDao);
		
	}
	
	@Test
	public void testGetById() throws Exception{
		CommentDao commentDao = new CommentDao();
		Comment comment = new Comment();
		
		Integer commentId =1;
		DatabaseDao databaseDao = new DatabaseDao();
		
		comment = commentDao.getById(commentId, databaseDao);
		assertNotNull(comment);
	}
	
	@Test
	public void testGetIdFromView() throws Exception{
		CommentUserView commentUserView = new CommentUserView();
		CommentDao commentDao = new CommentDao();
		
		Integer commentId =1;
		DatabaseDao databaseDao = new DatabaseDao();
		
		commentUserView = commentDao.getByIdFromView(commentId, databaseDao);
		assertNotNull(commentUserView);	
	}

}
