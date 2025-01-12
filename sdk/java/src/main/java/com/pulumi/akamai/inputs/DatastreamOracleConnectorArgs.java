// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.akamai.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class DatastreamOracleConnectorArgs extends com.pulumi.resources.ResourceArgs {

    public static final DatastreamOracleConnectorArgs Empty = new DatastreamOracleConnectorArgs();

    @Import(name="accessKey", required=true)
    private Output<String> accessKey;

    public Output<String> accessKey() {
        return this.accessKey;
    }

    @Import(name="bucket", required=true)
    private Output<String> bucket;

    public Output<String> bucket() {
        return this.bucket;
    }

    @Import(name="compressLogs")
    private @Nullable Output<Boolean> compressLogs;

    public Optional<Output<Boolean>> compressLogs() {
        return Optional.ofNullable(this.compressLogs);
    }

    @Import(name="displayName", required=true)
    private Output<String> displayName;

    public Output<String> displayName() {
        return this.displayName;
    }

    @Import(name="namespace", required=true)
    private Output<String> namespace;

    public Output<String> namespace() {
        return this.namespace;
    }

    @Import(name="path", required=true)
    private Output<String> path;

    public Output<String> path() {
        return this.path;
    }

    @Import(name="region", required=true)
    private Output<String> region;

    public Output<String> region() {
        return this.region;
    }

    @Import(name="secretAccessKey", required=true)
    private Output<String> secretAccessKey;

    public Output<String> secretAccessKey() {
        return this.secretAccessKey;
    }

    private DatastreamOracleConnectorArgs() {}

    private DatastreamOracleConnectorArgs(DatastreamOracleConnectorArgs $) {
        this.accessKey = $.accessKey;
        this.bucket = $.bucket;
        this.compressLogs = $.compressLogs;
        this.displayName = $.displayName;
        this.namespace = $.namespace;
        this.path = $.path;
        this.region = $.region;
        this.secretAccessKey = $.secretAccessKey;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(DatastreamOracleConnectorArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private DatastreamOracleConnectorArgs $;

        public Builder() {
            $ = new DatastreamOracleConnectorArgs();
        }

        public Builder(DatastreamOracleConnectorArgs defaults) {
            $ = new DatastreamOracleConnectorArgs(Objects.requireNonNull(defaults));
        }

        public Builder accessKey(Output<String> accessKey) {
            $.accessKey = accessKey;
            return this;
        }

        public Builder accessKey(String accessKey) {
            return accessKey(Output.of(accessKey));
        }

        public Builder bucket(Output<String> bucket) {
            $.bucket = bucket;
            return this;
        }

        public Builder bucket(String bucket) {
            return bucket(Output.of(bucket));
        }

        public Builder compressLogs(@Nullable Output<Boolean> compressLogs) {
            $.compressLogs = compressLogs;
            return this;
        }

        public Builder compressLogs(Boolean compressLogs) {
            return compressLogs(Output.of(compressLogs));
        }

        public Builder displayName(Output<String> displayName) {
            $.displayName = displayName;
            return this;
        }

        public Builder displayName(String displayName) {
            return displayName(Output.of(displayName));
        }

        public Builder namespace(Output<String> namespace) {
            $.namespace = namespace;
            return this;
        }

        public Builder namespace(String namespace) {
            return namespace(Output.of(namespace));
        }

        public Builder path(Output<String> path) {
            $.path = path;
            return this;
        }

        public Builder path(String path) {
            return path(Output.of(path));
        }

        public Builder region(Output<String> region) {
            $.region = region;
            return this;
        }

        public Builder region(String region) {
            return region(Output.of(region));
        }

        public Builder secretAccessKey(Output<String> secretAccessKey) {
            $.secretAccessKey = secretAccessKey;
            return this;
        }

        public Builder secretAccessKey(String secretAccessKey) {
            return secretAccessKey(Output.of(secretAccessKey));
        }

        public DatastreamOracleConnectorArgs build() {
            $.accessKey = Objects.requireNonNull($.accessKey, "expected parameter 'accessKey' to be non-null");
            $.bucket = Objects.requireNonNull($.bucket, "expected parameter 'bucket' to be non-null");
            $.displayName = Objects.requireNonNull($.displayName, "expected parameter 'displayName' to be non-null");
            $.namespace = Objects.requireNonNull($.namespace, "expected parameter 'namespace' to be non-null");
            $.path = Objects.requireNonNull($.path, "expected parameter 'path' to be non-null");
            $.region = Objects.requireNonNull($.region, "expected parameter 'region' to be non-null");
            $.secretAccessKey = Objects.requireNonNull($.secretAccessKey, "expected parameter 'secretAccessKey' to be non-null");
            return $;
        }
    }

}
