package oneserviceimpl;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;

import model.FTTIssueBase;
import repositories.FTTIssueBaseRepository;

public class Assetimpl {


@Autowired
FTTIssueBaseRepository repo;

public Optional<FTTIssueBase> findById(String id) {

	return repo.findById(id);
}
}