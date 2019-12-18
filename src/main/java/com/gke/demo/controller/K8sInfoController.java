package com.gke.demo.controller;

import com.gke.demo.model.K8Info;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.Console;

@RestController
public class K8sInfoController {
  private final K8Info k8Info;

  public K8sInfoController(K8Info k8Info) {
    this.k8Info = k8Info;
  }

  @GetMapping("/k8sinfo")
  public ResponseEntity<String> getMeasurement() {
    return ResponseEntity.ok(this.k8Info.toString());
  }
}
