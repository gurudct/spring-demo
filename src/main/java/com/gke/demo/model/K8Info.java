package com.gke.demo.model;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

@Configuration
@ConfigurationProperties("k8s")
public class K8Info {
  @Override
  public String toString() {
    return "K8Info{" +
        "nodeName='" + nodeName + '\'' +
        ", podName='" + podName + '\'' +
        ", podIp='" + podIp + '\'' +
        '}';
  }

  public String getNodeName() {
    return nodeName;
  }

  public void setNodeName(String nodeName) {
    this.nodeName = nodeName;
  }

  public String getPodName() {
    return podName;
  }

  public void setPodName(String podName) {
    this.podName = podName;
  }

  public String getPodIp() {
    return podIp;
  }

  public void setPodIp(String podIp) {
    this.podIp = podIp;
  }

  private String nodeName;
  private String podName;
  private String podIp;
}
