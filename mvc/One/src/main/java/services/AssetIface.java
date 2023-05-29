package services;

import java.util.Optional;

import model.FTTIssueBase;

public interface AssetIface {
	public Optional<FTTIssueBase> findById(String id);
}
