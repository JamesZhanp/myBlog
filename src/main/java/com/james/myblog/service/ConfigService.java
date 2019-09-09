package com.james.myblog.service;

import java.util.Map;

/**
 * @author: JamesZhan
 * @create: 2019 - 09 - 07 16:30
 */
public interface ConfigService {
    /**
     * 修改配置项
     *
     * @param configName
     * @param configValue
     * @return
     */
    int updateConfig(String configName, String configValue);

    /**
     * 获取所有的配置项
     *
     * @return
     */
    Map<String,String> getAllConfigs();
}
