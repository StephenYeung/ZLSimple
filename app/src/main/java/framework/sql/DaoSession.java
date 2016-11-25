package framework.sql;

import java.util.Map;

import org.greenrobot.greendao.AbstractDao;
import org.greenrobot.greendao.AbstractDaoSession;
import org.greenrobot.greendao.database.Database;
import org.greenrobot.greendao.identityscope.IdentityScopeType;
import org.greenrobot.greendao.internal.DaoConfig;

import framework.sql.SearchSuffix;

import framework.sql.SearchSuffixDao;

// THIS CODE IS GENERATED BY greenDAO, DO NOT EDIT.

/**
 * {@inheritDoc}
 * 
 * @see org.greenrobot.greendao.AbstractDaoSession
 */
public class DaoSession extends AbstractDaoSession {

    private final DaoConfig searchSuffixDaoConfig;

    private final SearchSuffixDao searchSuffixDao;

    public DaoSession(Database db, IdentityScopeType type, Map<Class<? extends AbstractDao<?, ?>>, DaoConfig>
            daoConfigMap) {
        super(db);

        searchSuffixDaoConfig = daoConfigMap.get(SearchSuffixDao.class).clone();
        searchSuffixDaoConfig.initIdentityScope(type);

        searchSuffixDao = new SearchSuffixDao(searchSuffixDaoConfig, this);

        registerDao(SearchSuffix.class, searchSuffixDao);
    }
    
    public void clear() {
        searchSuffixDaoConfig.clearIdentityScope();
    }

    public SearchSuffixDao getSearchSuffixDao() {
        return searchSuffixDao;
    }

}