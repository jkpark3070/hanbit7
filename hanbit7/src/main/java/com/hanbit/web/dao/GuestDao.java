package com.hanbit.web.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.hanbit.web.vo.GuestVo;



public interface GuestDao {
	public List<GuestVo> getAllGuests(int start, int end);
	public GuestVo getGuestByID(int id);
	public void addGuest(GuestVo guest);
	public void updateGuest(GuestVo guest);
	public void removeGuest(int guestNo);
	public int getTotCount();
} //class END








