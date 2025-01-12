// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Akamai.Outputs
{

    [OutputType]
    public sealed class DatastreamDatadogConnector
    {
        public readonly string AuthToken;
        public readonly bool? CompressLogs;
        public readonly string DisplayName;
        public readonly string Endpoint;
        public readonly string? Service;
        public readonly string? Source;
        public readonly string? Tags;

        [OutputConstructor]
        private DatastreamDatadogConnector(
            string authToken,

            bool? compressLogs,

            string displayName,

            string endpoint,

            string? service,

            string? source,

            string? tags)
        {
            AuthToken = authToken;
            CompressLogs = compressLogs;
            DisplayName = displayName;
            Endpoint = endpoint;
            Service = service;
            Source = source;
            Tags = tags;
        }
    }
}
