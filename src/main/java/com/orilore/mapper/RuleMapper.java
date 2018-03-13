package com.orilore.mapper;

import java.util.List;

import com.orilore.model.Rule;

public interface RuleMapper {
	public Rule selectOne(int id);
	public List<Rule> select();
}
