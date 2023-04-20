package Controller;

import java.io.IOException;
import java.util.Random;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import Dao.SellerDao;
import Model.Seller;
import service.Services;

/**
 * Servlet implementation class SellerController
 */
@WebServlet("/SellerController")
public class SellerController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public SellerController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String action = request.getParameter("action");
		if (action.equalsIgnoreCase("register")) {
			Seller s = new Seller();
			s.setName(request.getParameter("name"));
			s.setContact(Long.parseLong(request.getParameter("contact")));
			s.setAddress(request.getParameter("address"));
			s.setEmail(request.getParameter("email"));
			s.setPassword(request.getParameter("password"));
			SellerDao.insertSeller(s);
			request.setAttribute("msg", "data registered successfully");
			request.getRequestDispatcher("seller-login.jsp").forward(request, response);
		}
		else if (action.equalsIgnoreCase("login")) {
			Seller s = new Seller();
			s.setEmail(request.getParameter("email"));
			s.setPassword(request.getParameter("password"));
			String email = request.getParameter("email");
			boolean flag = SellerDao.checkEmail(email);
			if(flag == true) {
				Seller s1 = SellerDao.sellerLogin(s);
				if(s1 == null) {
					request.setAttribute("msg1", "password is incorrect");
					request.getRequestDispatcher("seller-login.jsp").forward(request, response);
				}
				else {
					HttpSession session = request.getSession();
					session.setAttribute("data", s1);
					request.getRequestDispatcher("seller-home.jsp").forward(request, response);
				}
			}
			else
			{
				request.setAttribute("msg2", "email is not registerd");
				request.getRequestDispatcher("seller-login.jsp").forward(request, response);
			}
		}
		else if(action.equalsIgnoreCase("update"))
		{
			Seller s = new Seller();
			s.setId(Integer.parseInt(request.getParameter("id")));
			s.setName(request.getParameter("name"));
			s.setContact(Long.parseLong(request.getParameter("contact")));
			s.setAddress(request.getParameter("address"));
			s.setEmail(request.getParameter("email"));
			SellerDao.updateProfile(s);
			HttpSession session = request.getSession();
			session.setAttribute("data", s);
			request.getRequestDispatcher("seller-home.jsp").forward(request, response);
		}
		else if (action.equalsIgnoreCase("change password")) {
			int id = Integer.parseInt(request.getParameter("id"));
			String op = request.getParameter("op");
			String np = request.getParameter("np");
			String cnp = request.getParameter("cnp");
			boolean flag = SellerDao.checkOldPassword(op, id);
			if (flag == true) {
				if (np.equals(cnp)) {
					SellerDao.updatePassword(np, id);
					response.sendRedirect("seller-home.jsp");
				} else {
					request.setAttribute("msg1", "New password and confirm new password not matched");
					request.getRequestDispatcher("seller-change-password.jsp").forward(request, response);
				}
			} else {
				request.setAttribute("msg", "old password not matched");
				request.getRequestDispatcher("seller-change-password.jsp").forward(request, response);
			}
		}
		
		else if (action.equalsIgnoreCase("get otp")) {
			String email = request.getParameter("email");
			Random r = new Random();
			int num = r.nextInt(999999);
			Services s = new Services();
			s.sendMail(email, num);
			request.setAttribute("email", email);
			request.setAttribute("otp", num);
			request.getRequestDispatcher("seller-verify-otp.jsp").forward(request, response);
		}
		else if(action.equalsIgnoreCase("verify")) {
			String email  = request.getParameter("email");
			int otp1 = Integer.parseInt(request.getParameter("otp1"));
			int otp2 = Integer.parseInt(request.getParameter("otp2"));
			if(otp1 == otp2) {
				request.setAttribute("email", email);
				request.getRequestDispatcher("seller-new-password.jsp").forward(request, response);
			}
			else {
				request.setAttribute("email", email);
				request.setAttribute("otp", otp1);
				request.setAttribute("msg", "OTP not metched");
				request.getRequestDispatcher("seller-verify-otp.jsp").forward(request, response);
			}
		}
		else if(action.equalsIgnoreCase("New Password")) {
			String email = request.getParameter("email");
			String np = request.getParameter("np");
			String cnp = request.getParameter("cnp");
			if(np.equals(cnp)) {
				SellerDao.updatePasswordF(email,cnp);
				response.sendRedirect("seller-login.jsp");
			} else {
				request.setAttribute("msg", "New password and confirm new password not matched");
				request.getRequestDispatcher("seller-change-password.jsp").forward(request, response);
			}
		}
	}
}