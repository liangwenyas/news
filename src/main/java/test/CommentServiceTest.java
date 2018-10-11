package test;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.Test;

import bean.CommentUserView;
import bean.Comment;
import service.CommentService;
import tools.PageInformation;

public class CommentServiceTest {

	@Test
	public void testGetOnePage() throws Exception{
		CommentService commentService = new CommentService();
		PageInformation page = new PageInformation();
		List<CommentUserView> commentUserView = commentService.getOnePage(page);
		assertEquals(new Integer(commentUserView.size()),page.getPageSize());
	}
	
	@Test
	public void tesPaise(Integer i) throws Exception{
		CommentService commentService = new CommentService();
		Integer t = commentService.paise(i);
		assertNotNull(t);
		
	}
	
	@Test
	public void testAddComment(Integer i) throws Exception{
		CommentService commentService = new CommentService();
		Comment comment = new Comment();
		Integer t = commentService.addComment(comment);
		assertNotNull(t);
	}
	
	@Test
	public void testAddCommentToComment(Integer i) throws Exception{
		CommentService commentService = new CommentService();
		Comment comment = new Comment();
		Integer t = commentService.addCommentToComment(comment);
		assertNotNull(t);
	}

}
