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
    public sealed class GetDatastreamsStreamPropertyResult
    {
        public readonly int PropertyId;
        public readonly string PropertyName;

        [OutputConstructor]
        private GetDatastreamsStreamPropertyResult(
            int propertyId,

            string propertyName)
        {
            PropertyId = propertyId;
            PropertyName = propertyName;
        }
    }
}