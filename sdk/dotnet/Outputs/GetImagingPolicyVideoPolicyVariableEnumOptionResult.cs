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
    public sealed class GetImagingPolicyVideoPolicyVariableEnumOptionResult
    {
        public readonly string Id;
        public readonly string Value;

        [OutputConstructor]
        private GetImagingPolicyVideoPolicyVariableEnumOptionResult(
            string id,

            string value)
        {
            Id = id;
            Value = value;
        }
    }
}