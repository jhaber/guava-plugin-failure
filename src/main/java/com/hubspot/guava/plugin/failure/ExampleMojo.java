package com.hubspot.guava.plugin.failure;

import org.apache.maven.plugin.AbstractMojo;
import org.apache.maven.plugins.annotations.Mojo;

import com.google.common.base.MoreObjects;

@Mojo(name = "example", threadSafe = true)
public class ExampleMojo extends AbstractMojo {

  @Override
  public void execute() {
    getLog().info(MoreObjects.firstNonNull("Hello world", null));
  }
}

