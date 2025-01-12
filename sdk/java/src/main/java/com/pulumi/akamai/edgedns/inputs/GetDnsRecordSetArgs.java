// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.akamai.edgedns.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class GetDnsRecordSetArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetDnsRecordSetArgs Empty = new GetDnsRecordSetArgs();

    @Import(name="host", required=true)
    private Output<String> host;

    public Output<String> host() {
        return this.host;
    }

    @Import(name="recordType", required=true)
    private Output<String> recordType;

    public Output<String> recordType() {
        return this.recordType;
    }

    @Import(name="zone", required=true)
    private Output<String> zone;

    public Output<String> zone() {
        return this.zone;
    }

    private GetDnsRecordSetArgs() {}

    private GetDnsRecordSetArgs(GetDnsRecordSetArgs $) {
        this.host = $.host;
        this.recordType = $.recordType;
        this.zone = $.zone;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetDnsRecordSetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetDnsRecordSetArgs $;

        public Builder() {
            $ = new GetDnsRecordSetArgs();
        }

        public Builder(GetDnsRecordSetArgs defaults) {
            $ = new GetDnsRecordSetArgs(Objects.requireNonNull(defaults));
        }

        public Builder host(Output<String> host) {
            $.host = host;
            return this;
        }

        public Builder host(String host) {
            return host(Output.of(host));
        }

        public Builder recordType(Output<String> recordType) {
            $.recordType = recordType;
            return this;
        }

        public Builder recordType(String recordType) {
            return recordType(Output.of(recordType));
        }

        public Builder zone(Output<String> zone) {
            $.zone = zone;
            return this;
        }

        public Builder zone(String zone) {
            return zone(Output.of(zone));
        }

        public GetDnsRecordSetArgs build() {
            $.host = Objects.requireNonNull($.host, "expected parameter 'host' to be non-null");
            $.recordType = Objects.requireNonNull($.recordType, "expected parameter 'recordType' to be non-null");
            $.zone = Objects.requireNonNull($.zone, "expected parameter 'zone' to be non-null");
            return $;
        }
    }

}
