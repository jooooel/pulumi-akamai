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
    public sealed class ClientlistListItem
    {
        public readonly string? Description;
        public readonly string? ExpirationDate;
        public readonly ImmutableArray<string> Tags;
        public readonly string Value;

        [OutputConstructor]
        private ClientlistListItem(
            string? description,

            string? expirationDate,

            ImmutableArray<string> tags,

            string value)
        {
            Description = description;
            ExpirationDate = expirationDate;
            Tags = tags;
            Value = value;
        }
    }
}