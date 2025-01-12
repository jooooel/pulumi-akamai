// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.akamai.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.Double;
import java.lang.Integer;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class CloudletsApplicationLoadBalancerLivenessSettingsArgs extends com.pulumi.resources.ResourceArgs {

    public static final CloudletsApplicationLoadBalancerLivenessSettingsArgs Empty = new CloudletsApplicationLoadBalancerLivenessSettingsArgs();

    @Import(name="additionalHeaders")
    private @Nullable Output<Map<String,String>> additionalHeaders;

    public Optional<Output<Map<String,String>>> additionalHeaders() {
        return Optional.ofNullable(this.additionalHeaders);
    }

    @Import(name="hostHeader")
    private @Nullable Output<String> hostHeader;

    public Optional<Output<String>> hostHeader() {
        return Optional.ofNullable(this.hostHeader);
    }

    @Import(name="interval")
    private @Nullable Output<Integer> interval;

    public Optional<Output<Integer>> interval() {
        return Optional.ofNullable(this.interval);
    }

    @Import(name="path", required=true)
    private Output<String> path;

    public Output<String> path() {
        return this.path;
    }

    @Import(name="peerCertificateVerification")
    private @Nullable Output<Boolean> peerCertificateVerification;

    public Optional<Output<Boolean>> peerCertificateVerification() {
        return Optional.ofNullable(this.peerCertificateVerification);
    }

    @Import(name="port", required=true)
    private Output<Integer> port;

    public Output<Integer> port() {
        return this.port;
    }

    @Import(name="protocol", required=true)
    private Output<String> protocol;

    public Output<String> protocol() {
        return this.protocol;
    }

    @Import(name="requestString")
    private @Nullable Output<String> requestString;

    public Optional<Output<String>> requestString() {
        return Optional.ofNullable(this.requestString);
    }

    @Import(name="responseString")
    private @Nullable Output<String> responseString;

    public Optional<Output<String>> responseString() {
        return Optional.ofNullable(this.responseString);
    }

    @Import(name="status3xxFailure")
    private @Nullable Output<Boolean> status3xxFailure;

    public Optional<Output<Boolean>> status3xxFailure() {
        return Optional.ofNullable(this.status3xxFailure);
    }

    @Import(name="status4xxFailure")
    private @Nullable Output<Boolean> status4xxFailure;

    public Optional<Output<Boolean>> status4xxFailure() {
        return Optional.ofNullable(this.status4xxFailure);
    }

    @Import(name="status5xxFailure")
    private @Nullable Output<Boolean> status5xxFailure;

    public Optional<Output<Boolean>> status5xxFailure() {
        return Optional.ofNullable(this.status5xxFailure);
    }

    @Import(name="timeout")
    private @Nullable Output<Double> timeout;

    public Optional<Output<Double>> timeout() {
        return Optional.ofNullable(this.timeout);
    }

    private CloudletsApplicationLoadBalancerLivenessSettingsArgs() {}

    private CloudletsApplicationLoadBalancerLivenessSettingsArgs(CloudletsApplicationLoadBalancerLivenessSettingsArgs $) {
        this.additionalHeaders = $.additionalHeaders;
        this.hostHeader = $.hostHeader;
        this.interval = $.interval;
        this.path = $.path;
        this.peerCertificateVerification = $.peerCertificateVerification;
        this.port = $.port;
        this.protocol = $.protocol;
        this.requestString = $.requestString;
        this.responseString = $.responseString;
        this.status3xxFailure = $.status3xxFailure;
        this.status4xxFailure = $.status4xxFailure;
        this.status5xxFailure = $.status5xxFailure;
        this.timeout = $.timeout;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(CloudletsApplicationLoadBalancerLivenessSettingsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private CloudletsApplicationLoadBalancerLivenessSettingsArgs $;

        public Builder() {
            $ = new CloudletsApplicationLoadBalancerLivenessSettingsArgs();
        }

        public Builder(CloudletsApplicationLoadBalancerLivenessSettingsArgs defaults) {
            $ = new CloudletsApplicationLoadBalancerLivenessSettingsArgs(Objects.requireNonNull(defaults));
        }

        public Builder additionalHeaders(@Nullable Output<Map<String,String>> additionalHeaders) {
            $.additionalHeaders = additionalHeaders;
            return this;
        }

        public Builder additionalHeaders(Map<String,String> additionalHeaders) {
            return additionalHeaders(Output.of(additionalHeaders));
        }

        public Builder hostHeader(@Nullable Output<String> hostHeader) {
            $.hostHeader = hostHeader;
            return this;
        }

        public Builder hostHeader(String hostHeader) {
            return hostHeader(Output.of(hostHeader));
        }

        public Builder interval(@Nullable Output<Integer> interval) {
            $.interval = interval;
            return this;
        }

        public Builder interval(Integer interval) {
            return interval(Output.of(interval));
        }

        public Builder path(Output<String> path) {
            $.path = path;
            return this;
        }

        public Builder path(String path) {
            return path(Output.of(path));
        }

        public Builder peerCertificateVerification(@Nullable Output<Boolean> peerCertificateVerification) {
            $.peerCertificateVerification = peerCertificateVerification;
            return this;
        }

        public Builder peerCertificateVerification(Boolean peerCertificateVerification) {
            return peerCertificateVerification(Output.of(peerCertificateVerification));
        }

        public Builder port(Output<Integer> port) {
            $.port = port;
            return this;
        }

        public Builder port(Integer port) {
            return port(Output.of(port));
        }

        public Builder protocol(Output<String> protocol) {
            $.protocol = protocol;
            return this;
        }

        public Builder protocol(String protocol) {
            return protocol(Output.of(protocol));
        }

        public Builder requestString(@Nullable Output<String> requestString) {
            $.requestString = requestString;
            return this;
        }

        public Builder requestString(String requestString) {
            return requestString(Output.of(requestString));
        }

        public Builder responseString(@Nullable Output<String> responseString) {
            $.responseString = responseString;
            return this;
        }

        public Builder responseString(String responseString) {
            return responseString(Output.of(responseString));
        }

        public Builder status3xxFailure(@Nullable Output<Boolean> status3xxFailure) {
            $.status3xxFailure = status3xxFailure;
            return this;
        }

        public Builder status3xxFailure(Boolean status3xxFailure) {
            return status3xxFailure(Output.of(status3xxFailure));
        }

        public Builder status4xxFailure(@Nullable Output<Boolean> status4xxFailure) {
            $.status4xxFailure = status4xxFailure;
            return this;
        }

        public Builder status4xxFailure(Boolean status4xxFailure) {
            return status4xxFailure(Output.of(status4xxFailure));
        }

        public Builder status5xxFailure(@Nullable Output<Boolean> status5xxFailure) {
            $.status5xxFailure = status5xxFailure;
            return this;
        }

        public Builder status5xxFailure(Boolean status5xxFailure) {
            return status5xxFailure(Output.of(status5xxFailure));
        }

        public Builder timeout(@Nullable Output<Double> timeout) {
            $.timeout = timeout;
            return this;
        }

        public Builder timeout(Double timeout) {
            return timeout(Output.of(timeout));
        }

        public CloudletsApplicationLoadBalancerLivenessSettingsArgs build() {
            $.path = Objects.requireNonNull($.path, "expected parameter 'path' to be non-null");
            $.port = Objects.requireNonNull($.port, "expected parameter 'port' to be non-null");
            $.protocol = Objects.requireNonNull($.protocol, "expected parameter 'protocol' to be non-null");
            return $;
        }
    }

}
